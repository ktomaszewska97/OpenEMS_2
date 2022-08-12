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
  selector: LoadManagement.SELECTOR,
  templateUrl: './loadmanagement.component.html',
})
export class LoadManagement {
  private static readonly SELECTOR = 'loadmanagement';

  @Input() private componentId: string;

  private edge: Edge = null;
  public component: EdgeConfig.Component = null;
  previousChargeState = 1;
  chargeValue: string = '';

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
          LoadManagement.SELECTOR + this.componentId,
          [
            new ChannelAddress(this.componentId, 'TotalStartTime'),
            new ChannelAddress(this.componentId, 'Total'),
            new ChannelAddress(this.componentId, 'Yesterday'),
            new ChannelAddress(this.componentId, 'Today'),
            new ChannelAddress(this.componentId, 'Power'),
            new ChannelAddress(this.componentId, 'ApparentPower'),
            new ChannelAddress(this.componentId, 'ReactivePower'),
            new ChannelAddress(this.componentId, 'Factor'),
            new ChannelAddress(this.componentId, 'Voltage'),
            new ChannelAddress(this.componentId, 'Current'),
            new ChannelAddress(this.componentId, 'ButtonStatusOn'),
            new ChannelAddress(this.componentId, 'ButtonStatusOff'),
          ]
        );
      });
    });
  }

  ngOnDestroy() {
    if (this.edge != null) {
      this.edge.unsubscribeChannels(
        this.websocket,
        LoadManagement.SELECTOR + this.componentId
      );
    }
  }

  buttonStatusOn() {
    if (this.edge) {
      this.edge
        .sendRequest(
          this.websocket,
          new SetChannelValueRequest({
            componentId: this.component.id,
            channelId: 'ChannelValues',
            value: {
              buttonStatusOn: 1,
            },
          })
        )
        .then((response) => {
          this.service.toast('Button status on.', 'success');
        })
        .catch((reason) => {
          this.service.toast('Error', 'danger');
        });
    }
  }

  buttonStatusOff() {
    if (this.edge) {
      this.edge
        .sendRequest(
          this.websocket,
          new SetChannelValueRequest({
            componentId: this.component.id,
            channelId: 'ChannelValues',
            value: {
              buttonStatusOff: 1,
            },
          })
        )
        .then((response) => {
          this.service.toast('Button status off.', 'success');
        })
        .catch((reason) => {
          this.service.toast('Error', 'danger');
        });
    }
  }
}
