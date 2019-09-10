import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplayproductsComponent } from './displayproducts/displayproducts.component'
import { CustomersignupComponent } from './customersignup/customersignup.component'
import { CustloginComponent } from './custlogin/custlogin.component'
import { WishlistProductComponent} from './wishlist-product/wishlist-product.component';
import { WishlistComponent } from './wishlist/wishlist.component'
const routes: Routes = [
  {
    path : 'displayproducts',
    component : DisplayproductsComponent
  }
  ,
  {
    path : 'signup',
    component : CustomersignupComponent
  }
  ,
  {
    path : '',
    component : CustloginComponent
  },
  {
    path:'wishlist',
    component:WishlistComponent
  },
  {
    path : 'wishlistproduct',
    component : WishlistProductComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
