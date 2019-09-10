import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from '../../node_modules/rxjs';
@Injectable({
  providedIn: 'root'
})
export class DispproductserviceService {

  private baseUrl='http://localhost:3456';
  constructor(private http:HttpClient) { }


  public customerlogin(customer):Observable<String>{
    alert(customer.password)
    return this.http.get(`${this.baseUrl}/login/${customer.email}/${customer.password}`,{responseType:"text"});
  }
  public displayproducts():Observable<any>
  {
    return this.http.get(`${this.baseUrl}/login/`)
  }

  public createAccount(user) :Observable<any>{
    console.log(user.email+" Service")
    return this.http.post(`${this.baseUrl}`+`/customer`, user);
  }

  public addtowishlist(prodId) :Observable<any>{
    console.log(prodId)
    return this.http.post(`${this.baseUrl}/wishlist/${prodId}`,{responseType:"text"});
  }
  public showWishlist(prod_Id) :Observable<any>{
    console.log(prod_Id)
    return this.http.get(`${this.baseUrl}/wishlist/`)
  }
}

