import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Coins} from './Coins';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  makeChange(amount: number) {
    return this.http.post<Coins>('http://localhost:8080/coincalc', {
      headers: {'Content-Type': 'application/JSON'},
      'amount': amount
    });
  }
}
