import { Component, OnInit } from '@angular/core';
import {DispproductserviceService} from '../dispproductservice.service'
import { User } from '../user';
import { Router } from '../../../node_modules/@angular/router';
@Component({
  selector: 'app-customersignup',
  templateUrl: './customersignup.component.html',
  styleUrls: ['./customersignup.component.css']
})
export class CustomersignupComponent implements OnInit {

  user: User = new User();
  result : any
  constructor(private router: Router, private service : DispproductserviceService) { }

  ngOnInit() {
  }

  newUser(): void {
    this.user= new User();
  }

  createAccount(): void {
    console.log("Name: " + this.user.name)
    this.service.createAccount(this.user)
        .subscribe( data => { this.result = data;
         console.log(this.result)
        });
        this.router.navigate(['/'])
  };



  onSubmit() {
    this.createAccount();
  }

}

