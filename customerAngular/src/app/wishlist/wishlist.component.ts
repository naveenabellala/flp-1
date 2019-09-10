import { Component, OnInit } from '@angular/core';
import { DispproductserviceService } from'../dispproductservice.service'

@Component({
  selector: 'app-wishlist',
  templateUrl: './wishlist.component.html',
  styleUrls: ['./wishlist.component.css']
})
export class WishlistComponent implements OnInit {
  results:any
  submitted:any
  constructor(private service: DispproductserviceService ) { }

  ngOnInit() {
  }

  displaywishlist(prod_id)
  {
    this.service.addtowishlist(prod_id).subscribe(data => {
      this.results = data;
      this.submitted = true;
      

    });
  }
}
