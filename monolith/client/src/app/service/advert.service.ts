import {Injectable} from '@angular/core';
import {ApiService} from './api.service';
import {ConfigService} from './config.service';
import {map} from 'rxjs/operators';
import { Observable } from 'rxjs';
import {Advert} from '../shared/models/advert';


@Injectable({
  providedIn: 'root'
})
export class AdvertService {

  currentUser;
  
  constructor(
    private apiService: ApiService,
    private config: ConfigService
  ) { 
  }
  
  getAdvertsFrom(): Observable<Advert[]>{
    return this.apiService.get(this.config.users_adverts_url);
  }

}
