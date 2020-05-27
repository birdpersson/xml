import { Component, OnInit } from '@angular/core';
import { AdvertService } from 'app/service/advert.service';
import { UserService } from 'app/service';
import { Advert } from 'app/shared/models/advert';

@Component({
  selector: 'app-advert',
  templateUrl: './advert.component.html',
  styleUrls: ['./advert.component.css']
})
export class AdvertComponent implements OnInit {

  constructor(
    private advertService:AdvertService,    
    private userService: UserService) { }
  usersAdverts: Advert[];
  me: any;
  ngOnInit() {
    
   this.showMyAdverts();
   this.showMyUserName();
  }
  
  public showMyUserName(){
    this.userService.getMyInfo()
    .subscribe(data => this.me = data);

  }
  public showMyAdverts(){
    this.advertService.getAdvertsFrom()
    .subscribe( data => this.usersAdverts = data);
   
  }

}
