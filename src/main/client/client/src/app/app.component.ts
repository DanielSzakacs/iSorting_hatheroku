import { Component } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'schoolapp_dash';

  showStudents = false;
  showStaff = false;
  showSchoolMap = false;
  showEvents = false;
  showHouseHistory = false;
  constructor(){}

  homePage(){
    this.showStudents = false;
    this.showSchoolMap = false;
    this.showEvents = false;
    this.showStaff = false;
    this.showHouseHistory = false;
  }

  /**
   * Switch the visibility of the component
   */
  switchTeacherTableComponent() {
    this.showStudents = false;
    this.showSchoolMap = false;
    this.showEvents = false;
    this.showHouseHistory = false;
    this.showStaff = true;
  }

  /**
   * Switch the visibility of the component
   */
  switchListOfStudentComponent(){
    this.showStaff = false;
    this.showSchoolMap = false;
    this.showEvents = false;
    this.showHouseHistory = false;
    this.showStudents = true;
  }

  switchSchoolMapComponent(){
    this.showStaff = false;
    this.showStudents = false;
    this.showEvents = false;
    this.showHouseHistory = false;
    this.showSchoolMap = true;
  }

  switchEventsComponent() {
    this.showStaff = false;
    this.showStudents = false;
    this.showSchoolMap = false;
    this.showHouseHistory = false;
    this.showEvents = true;
  }

  switchHouseHistory(){
    this.showStaff = false;
    this.showStudents = false;
    this.showSchoolMap = false;
    this.showEvents = false;
    this.showHouseHistory = true;
  }
}
