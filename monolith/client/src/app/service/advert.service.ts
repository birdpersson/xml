import {Injectable} from '@angular/core';
import {ApiService} from './api.service';
import {ConfigService} from './config.service';
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
  
  getAdvertsFrom( ): Observable<Advert[]>{
    return this.apiService.get(this.config.users_adverts_url);
  }
  

  postNewAdvert( ad:Advert ): Observable<Advert[]>{
   return this.apiService.post(this.config.add_advert_url , ad);
   
  }  
  
  deleteAdvert(id): Observable<void>{
    return this.apiService.delete(this.config.delete_advert_url + '/' + id);
  }
}
