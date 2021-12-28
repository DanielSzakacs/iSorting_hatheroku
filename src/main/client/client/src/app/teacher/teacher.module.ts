import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class TeacherModule { 

    public id: number | undefined;  

    public name : string | undefined;
    public position : string | undefined;
    public details : string | undefined;
    public image : string | undefined;
}