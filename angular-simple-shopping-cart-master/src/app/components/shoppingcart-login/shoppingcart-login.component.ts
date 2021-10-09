import { Component, ElementRef, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';
import { ProductsDataService } from 'app/services/products.service';

@Component({
  selector: 'app-shoppingcart-login',
  templateUrl: './shoppingcart-login.component.html',
  styleUrls: ['./shoppingcart-login.component.scss']
})
export class ShoppingcartLoginComponent implements OnInit {
  @ViewChild('myModal') modal: ElementRef;
  @Output() userName = new EventEmitter<any>();

  userEmail:any;
  userPassword:any;

  IsLoginFailed :boolean = false;
  constructor(private productsService: ProductsDataService) { }

  ngOnInit() {
    this.userEmail = "";
    this.userPassword="";
  }

  open() {
    this.IsLoginFailed= false;
    this.modal.nativeElement.style.display = 'block';
  }

  close() {
    this.modal.nativeElement.style.display = 'none';
    this.IsLoginFailed= false;
  }
  Login()
  {
    
    this.IsLoginFailed= false;

    var body = {
      "userId" :this.userEmail,
      "password" : this.userPassword
    }    

     this.productsService.AunthenticateLogin(body).subscribe((data)=>{
      this.modal.nativeElement.style.display = 'none'; 
      this.userName.emit(data);
    },(error) => {
      this.IsLoginFailed= true;
    }); 
    console.log(body);

  }

}
