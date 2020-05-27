import { Component, OnInit } from '@angular/core';
import { AdvertService } from 'app/service/advert.service';
import { Advert } from 'app/shared/models/advert';

@Component({
  selector: 'app-advert',
  templateUrl: './advert.component.html',
  styleUrls: ['./advert.component.css']
})
export class AdvertComponent implements OnInit {

  constructor(private advertService:AdvertService) { }
  usersAdverts: Advert[];
  ngOnInit() {
    
   this.showMyAdverts();
  }
  public showMyAdverts(){
    this.advertService.getMyAdverts()
    .subscribe( data => this.usersAdverts = data);
   
  }

}
