import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { TeacherModule } from '../teacher/teacher.module';

@Component({
  selector: 'app-teachers',
  templateUrl: './teachers.component.html',
  styleUrls: ['./teachers.component.css']
})
export class TeachersComponent implements OnInit {
  static listOfStaffStatic: TeacherModule[] = [];
  listOfStaff: TeacherModule[] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    if(TeachersComponent.listOfStaffStatic.length == 0){
      this.getAllTheStaff();
    }
    this.listOfStaff = TeachersComponent.listOfStaffStatic;
  }

  getAllTheStaff(){
    return this.http.get<TeacherModule[]>("http://localhost:8080/getAllTeacher").subscribe(
      result =>{
        result.forEach((e) => TeachersComponent.listOfStaffStatic.push(e))
      }
    );
  }
}
