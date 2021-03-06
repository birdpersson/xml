import { Injectable } from '@angular/core';
import { ApiService } from './api.service';
import { ConfigService } from '.';

@Injectable({
  providedIn: 'root'
})
export class CodebookService {  

  constructor(
    private apiService: ApiService,
    private config: ConfigService
) { }

    codebook;
  
    getCodebook() {
      return this.apiService.get(this.config.get_codebook_url);
    }
    getCities(){
      return this.apiService.get(this.config.get_cities_url);
    }
    
}
