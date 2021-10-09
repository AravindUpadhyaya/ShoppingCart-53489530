import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";

import { StoreFrontComponent } from "./components/store-front/store-front.component";
import { ShoppingcartLoginComponent } from "./components/shoppingcart-login/shoppingcart-login.component";
import { ShoppingcartOrdernoComponent } from "./components/shoppingcart-orderno/shoppingcart-orderno.component";
import { ShoppingcartCheckoutComponent } from "./components/shoppingcart-checkout/shoppingcart-checkout.component";

@NgModule({
    exports: [RouterModule],
    imports: [
        RouterModule.forRoot([
            {
                component: ShoppingcartCheckoutComponent,
                path: "checkout"
            }, 
            {
                component: ShoppingcartLoginComponent,
                path: "login"
            },
            {
                component: ShoppingcartOrdernoComponent,
                path: "order"
            },                        
            {
                component: StoreFrontComponent,
                path: "home"
            },
            {
                component: StoreFrontComponent,
                path: "**"
            }])
    ]
})
export class AppRoutingModule { }
