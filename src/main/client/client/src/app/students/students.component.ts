import { Component, NgIterable, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { StudentModule } from '../student/student.module';
import {AlertService} from "ngx-alerts";


@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {
  static listOfStudentsStatic: StudentModule[] = [];
  listOfStudents: StudentModule[] = [];

  constructor(private http: HttpClient, 
    private alertService: AlertService){}

  ngOnInit(): void { 
    if(StudentsComponent.listOfStudentsStatic.length == 0){
      this.getAllStudent();
    }
    this.listOfStudents = StudentsComponent.listOfStudentsStatic;
  }


  getAllStudent(){
    return this.http.get<StudentModule[]>("/getAllStudent").subscribe(
      result =>{
        result.forEach((e) => StudentsComponent.listOfStudentsStatic.push(e))
      }
    );
  }

  getTimeTable(user: StudentModule): Array<Array<string>> {
    return Object.entries(user.timeTable.classesOfTheWeek);
  }


}
enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}