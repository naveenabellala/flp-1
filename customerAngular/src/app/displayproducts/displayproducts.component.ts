import { Component, OnInit } from '@angular/core';
import { DispproductserviceService } from '../dispproductservice.service'
import { Router } from '../../../node_modules/@angular/router';
@Component({
  selector: 'app-displayproducts',
  templateUrl: './displayproducts.component.html',
  styleUrls: ['./displayproducts.component.css']
})
export class DisplayproductsComponent implements OnInit {
  result: any
  results:any
  submitted = false;
  constructor(private router: Router,private service: DispproductserviceService) { }

  ngOnInit() {
    this.printTransaction()
  }

  printTransaction(): void {
    this.service.displayproducts().subscribe(data => {
      this.result = data;
      this.submitted = true;

      console.log(this.result);
    });
  }
  wishlist(prod_id)
  {
    this.service.addtowishlist(prod_id).subscribe(data => {
      this.results = data;
      this.submitted = true;
      
      alert("product added successfully")
    });
  }

}
