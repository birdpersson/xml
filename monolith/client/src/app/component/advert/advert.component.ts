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
  new_advert:Advert;
  ngOnInit() {
    this.showMyAdverts();
    this.new_advert = new Advert();
    this.getMyInfo();
   
  }
  
  public getMyInfo(){
    this.userService.getMyInfo()
    .subscribe(data => this.me = data);

  }
  public showMyAdverts(){
    this.advertService.getAdvertsFrom()
    .subscribe( data => this.usersAdverts = data);
   
  }
  submitAddForm(){
    this.advertService.postNewAdvert(this.new_advert)
    .subscribe((data)=> {      
      this.new_advert.user_id = this.me.id;    
      this.usersAdverts = data;
    });
  }

}
