import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule ,ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DisplayproductsComponent } from './displayproducts/displayproducts.component';
import { CustomersignupComponent } from './customersignup/customersignup.component';
import { CustloginComponent } from './custlogin/custlogin.component';
import { WishlistComponent } from './wishlist/wishlist.component';
import { WishlistProductComponent } from './wishlist-product/wishlist-product.component';
import { CartComponent } from './cart/cart.component';
import { CartlistComponent } from './cartlist/cartlist.component';


@NgModule({
  declarations: [
    AppComponent,
    DisplayproductsComponent,
    CustomersignupComponent,
    CustloginComponent,
    WishlistComponent,
    WishlistProductComponent,
    CartComponent,
    CartlistComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
