import { ChartDataSets, ChartOptions } from 'chart.js';
import { Color, Label } from 'ng2-charts';
import { ActivatedRoute } from '@angular/router';
import {
  ChannelAddress,
  Edge,
  EdgeConfig,
  Service,
  Websocket,
} from '../../../shared/shared';
import { Component, Input, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { SetChannelValueRequest } from 'src/app/shared/jsonrpc/request/setChannelValueRequest';

@Component({
  selector: LineChartComponent.SELECTOR,
  templateUrl: './line-chart.component.html',
})
export class LineChartComponent {
  private static readonly SELECTOR = 'app-line-chart';
  @Input() private componentId: string;

  private edge: Edge = null;
  public component: EdgeConfig.Component = null;
  private previousState = false;

  constructor(
    private route: ActivatedRoute,
    private websocket: Websocket,
    public modalController: ModalController,
    public service: Service
  ) {}

  ngOnInit() {
    this.service.setCurrentComponent('', this.route).then((edge) => {
      this.edge = edge;
      this.service.getConfig().then((config) => {
        this.component = config.getComponent(this.componentId);
        console.log('Component ID' + this.componentId);
        edge.subscribeChannels(
          this.websocket,
          LineChartComponent.SELECTOR + this.componentId,
          [
            new ChannelAddress(this.componentId, 'ProductionW'),
            new ChannelAddress(this.componentId, 'Timestamp'),
          ]
        );
      });
    });
  }

  ngOnDestroy() {
    if (this.edge != null) {
      this.edge.unsubscribeChannels(
        this.websocket,
        LineChartComponent.SELECTOR + this.componentId
      );
    }
  }

  lineChartData: ChartDataSets[] = [
    { data: [85, 72, 78, 75, 77, 75], label: 'Crude oil prices' },
  ];

  lineChartLabels: Label[] = [
    'January',
    'February',
    'March',
    'April',
    'May',
    'June',
  ];
  lineChartOptions = {
    responsive: true,
  };
  lineChartColors: Color[] = [
    {
      borderColor: 'black',
      backgroundColor: 'rgba(255,255,0,0.28)',
    },
  ];
  lineChartLegend = true;
  lineChartPlugins = [];
  lineChartType = 'line';
}
