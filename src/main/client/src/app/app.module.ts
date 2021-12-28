import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule } from '@angular/common/http';
import { StudentsComponent } from './students/students.component';

import { FormsModule } from '@angular/forms';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ReactiveFormsModule} from "@angular/forms";

import { AlertModule } from 'ngx-alerts';
import { TeachersComponent } from './teachers/teachers.component';
import { SchoolMapComponent } from './school-map/school-map.component';
import { EventsComponent } from './events/events.component';
import { HouseHistoryComponent } from './house-history/house-history.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentsComponent,
    TeachersComponent,
    SchoolMapComponent,
    EventsComponent,
    HouseHistoryComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    AlertModule.forRoot({maxMessages: 5, timeout: 5000})

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
