import { Component, OnInit } from '@angular/core';
import {FormControl , FormGroup} from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public submitted: boolean;
  roomsearch: FormGroup;
  rooms: Room[];
  ngOnInit() {
    this.roomsearch = new FormGroup({
      checkin   : new FormControl(''),
      checkout  : new FormControl('')
    });
    this.rooms = ROOMS;
  }

    onSubmit({value, valid}: {value: Roomsearch , valid: boolean}) {
        console.log(value);
    }
  }

  export interface Roomsearch  {
    checkin: string;
    checkout: string;
  }

    export interface Room  {
    id: string;
    roomNumber: string;
    price: string;
    links: string;
  }

  // tslint:disable-next-line:prefer-const
  let ROOMS: Room[] = [
    {
      'id' : '1233344',
      'roomNumber' : '109' ,
      'price' : '10' ,
      'links' : ''
    },
    {
      'id' : '2222222',
      'roomNumber' : '209' ,
      'price' : '20' ,
      'links' : ''
    },
    {
      'id' : '3333333',
      'roomNumber' : '309' ,
      'price': '30' ,
      'links' : ''
    }

  ];
