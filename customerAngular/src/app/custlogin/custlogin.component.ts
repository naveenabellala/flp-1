import { Component, OnInit } from '@angular/core';
import { DispproductserviceService } from '../dispproductservice.service'
import { Router } from '../../../node_modules/@angular/router';
@Component({
  selector: 'app-custlogin',
  templateUrl: './custlogin.component.html',
  styleUrls: ['./custlogin.component.css']
})
export class CustloginComponent implements OnInit {
  result:any;
  
  constructor( private router: Router ,  private service : DispproductserviceService) {  }

  ngOnInit() {
  }

  login(add)
  {
   
   if(add.choice=="customer"){
    this.service.customerlogin(add).subscribe(data=>{
      this.result=data
      if(this.result=="Login Successful"){
          alert(this.result)
          this.router.navigate(['/displayproducts'])
      }
      else{
        console.log(this.result)
        alert(this.result)
        }
    });
   }
   else
   {
    alert("This is not admin page")
   }
  }

}
