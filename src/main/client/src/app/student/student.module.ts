import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { StringMapWithRename } from '@angular/compiler/src/compiler_facade_interface';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class StudentModule {
  public id : number | undefined;

  public name : string | undefined;
  public details: string | undefined;
  public dateOfBorn: string | undefined;
  public yearOfBorn: string | undefined;

  public groupe: any | undefined;
  public magicWand: any | undefined;
  public ancestry: string | undefined;

  public image: string | undefined;
  public timeTable: any | undefined;

 }
