import { Component, OnInit } from '@angular/core';

import { OrderDto } from "app/models/product.model";
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-shoppingcart-orderno',
  templateUrl: './shoppingcart-orderno.component.html',
  styleUrls: ['./shoppingcart-orderno.component.scss']
})
export class ShoppingcartOrdernoComponent implements OnInit {

  getItem: string;
  orderNo: string;
  deliveryMessage: string;
  orderConfirmMessage: String;
  constructor(private router: Router, private route: ActivatedRoute,) { }

  ngOnInit() {

    this.deliveryMessage = "Thank you for your Order {{orderNo}}, it will be dispatched shortly!!"
    this.getItem = this.route.snapshot.queryParamMap.get("OrderDto");
    var lst = JSON.parse(JSON.parse(this.getItem));
    this.orderNo = lst.orderNo;
  }
}
