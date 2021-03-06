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
  currentUser: any;
  usersAdverts: Advert[];
  new_advert: Advert;
  
  ngOnInit() {
    //Bitan redosled jer se u novi_oglas referencira id korisnika.
    this.new_advert = new Advert();  
    this.new_advert.user_id;      
    this.showMyAdverts();    
    this.getMyInfo();
    
  }
  //Metoda za vracanja celog objekta korisnika/agencije/admina i referenciranje svakog novog entiteta ka njemu*
  getMyInfo(){
    this.userService.getMyInfo()
    .subscribe(data => {this.currentUser = data,
                        this.new_advert.user_id = this.currentUser.id});

  }
  //Prikaz svih oglasa od ulogovanog usera
  showMyAdverts(){
    this.advertService.getAdvertsFrom()
    .subscribe( data => this.usersAdverts = data);   
  } 
  
  //Dodavanje novog oglasa  
  submitAddForm(){    
   this.advertService.postNewAdvert(this.new_advert).subscribe((data)=> {       
      this.usersAdverts = data});
      return true;
  }    
  //Brisanje novog oglasa
  deleteAdvert(id:number)
  {
    this.advertService.deleteAdvert(id).subscribe(
      res => this.showMyAdverts()
    );
      
  }
}
