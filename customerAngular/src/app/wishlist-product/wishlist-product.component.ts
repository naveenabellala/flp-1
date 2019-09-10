import { Component, OnInit } from '@angular/core';
import { DispproductserviceService } from'../dispproductservice.service'

@Component({
  selector: 'app-wishlist-product',
  templateUrl: './wishlist-product.component.html',
  styleUrls: ['./wishlist-product.component.css']
})
export class WishlistProductComponent implements OnInit {
  results:any
  submitted:any
  prod_Id : number
  constructor(private service: DispproductserviceService ) { }

  ngOnInit() {
    this.printTransaction(this.prod_Id)
  }
  

  printTransaction(prod_Id): void {
    this.service.showWishlist(prod_Id).subscribe(data => {
      this.results = data;
      this.submitted = true;

      console.log(this.results);
    });
  }



}
