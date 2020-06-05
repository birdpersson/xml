import { Component, OnInit } from '@angular/core';
import { CodebookService } from 'app/service/codebook.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-search-adverts-bar',
  templateUrl: './search-adverts-bar.component.html',
  styleUrls: ['./search-adverts-bar.component.css']
})
export class SearchAdvertsBarComponent implements OnInit {

  constructor(private cbservice : CodebookService) { }

  private cities: any;
  ngOnInit() {
    this.showCities();
  }

  cityList = new FormControl();
  
  showCities(){
    console.log("da");
    this.cbservice.getCities().subscribe(data => this.cities = data);
  }
}
