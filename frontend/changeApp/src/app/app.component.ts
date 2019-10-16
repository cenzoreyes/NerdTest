import { Component } from '@angular/core';
import {DataService} from './data.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Coins} from './Coins';
import {log} from 'util';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  title = 'changeApp';
  amount = 0;
  inputForm = new FormGroup({amountInput: new FormControl('',[ Validators.required,
      Validators.pattern('^-?[0-9]\\d*(\\.\\d{1,2})?$')])});
  coinData = new Coins();

  constructor(private service: DataService) {}

  async makeChange() {
    this.service.makeChange(this.amount).subscribe((data: Coins) => this.coinData = {
      amount: data.amount,
      silverDollar: data.silverDollar,
      halfDollar: data.halfDollar,
      quarter: data.quarter,
      dime: data.dime,
      nickel: data.nickel,
      penny: data.penny
    });
  }
}
