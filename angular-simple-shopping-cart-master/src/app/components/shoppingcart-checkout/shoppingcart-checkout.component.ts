import { Component, OnInit } from '@angular/core';

import { Http, Headers, Response } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { HttpErrorResponse } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';

import { Product, ShoppingCartDto, OrderDto } from '../../models/product.model';
import { ActivatedRoute } from '@angular/router';
import { ProductsDataService } from '../../services/products.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-shoppingcart-checkout',
  templateUrl: './shoppingcart-checkout.component.html',
  styleUrls: ['./shoppingcart-checkout.component.scss']
})

export class ShoppingcartCheckoutComponent implements OnInit {
  products: any;
  TotalItemsCout: any = 0;
  deliveryOptions: any;
  TotalGrossAmount: any = 0;
  TotalAmount: any = 0;
  DeliveryAmount: any = 0;
  DeliveryOptionID: any;
  DeliveryCode: any;
  SumAmount: number;
  IsChecked: boolean = false;
  UserId: string = "";
  OrderID: any;
  isLoading: boolean = false;

  constructor(private productsService: ProductsDataService, private route: ActivatedRoute, private router: Router, private httpClient: HttpClient) { }

  ngOnInit() {
    this.products = localStorage.getItem('productDetails');
    this.products = JSON.parse(this.products)
    console.log(this.products);
    this.TotalItemsCout = this.products.length;
    this.TotalAmount = localStorage.getItem('TotalAmount');
    this.TotalGrossAmount = this.TotalAmount;
    this.UserId = localStorage.getItem("UserName");

    this.httpClient.get("./assets/delivery-options.json").subscribe(data => {
      console.log(data);
      this.deliveryOptions = data;
    })
  }
  OnChangeDeliveryOption(deliveryoption, event) {
    this.SumAmount = 0;
    this.SumAmount = parseFloat(this.TotalAmount) + parseFloat(deliveryoption.price);
    this.DeliveryAmount = deliveryoption.price;
    this.DeliveryOptionID = deliveryoption.id;
    this.DeliveryCode = deliveryoption.code;
    console.log(this.TotalAmount);
    this.TotalGrossAmount = this.SumAmount;
    if (event == "1") {
      this.IsChecked = true;
    }

  }
  OnCheckout() {

    var ItemsJson = [];
    this.products.forEach(function (item) {

      ItemsJson.push({
        "quantity": item["quantity"],
        "price": item["price"],
        "productId": item["id"]
      });
    });
    var body = {
      "items": ItemsJson,
      "grossTotal": this.TotalGrossAmount,
      "deliveryTotal": this.DeliveryAmount,
      "itemsTotal": this.TotalItemsCout,
      "userId": "1",
      "deliveryOptionId": this.DeliveryOptionID,
      "deliveryOptionCode": this.DeliveryCode
    }
    this.isLoading = true;
    this.productsService.PurchaseOrder(body).subscribe((data) => {
      this.isLoading = false;
      this.openOrderConfirmModal();
      console.log("OrderId: ", data);
      this.OrderID = data;
    }, (error) => {
      this.isLoading = false;
      window.alert("Failed to place order");
    });

  }
  ContinueShopping() {
    this.router.navigate(['']);
  }

  openOrderConfirmModal() {

    var modal = document.getElementById("OrderConfirmModal");
    modal.style.display = "block";
  }
  closeOrderConfirmModal() {
    var modal = document.getElementById("OrderConfirmModal");
    modal.style.display = "none";
  }
}
