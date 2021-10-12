import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Product } from "app/models/product.model";
import "rxjs/add/operator/map";
import { Observable } from "rxjs/Observable";
import { CachcingServiceBase } from "./caching.service";

let count = 0;
const serverurl = "http://localhost:8080/";
const productListUrl = "/shopec/products";

@Injectable()
export class ProductsDataService extends CachcingServiceBase {
  private products: Observable<Product[]>;

  public constructor(private http: HttpClient) {
    super();
  }

  public all(): Observable<Product[]> {
    return this.cache<Product[]>(() => this.products,
                                 (val: Observable<Product[]>) => this.products = val,
                                 () => this.http
                                           .get<Product[]>(serverurl + productListUrl)
                                          );

  }
  
    AunthenticateLogin(loginDetails) {
    let url = serverurl + "/account/login";
    return this.http.post(url, loginDetails);
  }
  PurchaseOrder(OrderDetails)
  {
    let url = serverurl + "/order";
    return this.http.post(url, OrderDetails);
  }
}
