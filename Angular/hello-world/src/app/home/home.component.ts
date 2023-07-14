import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  public name : string = "Eron Moraes"
  public tempo: string = "nevando!"
  public dia : number = 17;
  public date: Date = new Date();

}
