import { Component, OnInit } from '@angular/core';
import { RestapiService } from '../restapi.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  users:any;
  constructor(private service:RestapiService) { }

  ngOnInit() {
  }

  getUsers(){
let resp=this.service.getUsers();
resp.subscribe(data=>this.users=data);
  }

}
