import { Injectable } from '@angular/core';
import { Observable,Subject} from 'rxjs';
  
@Injectable()
export class MessageService {
    private subject = new Subject<any>();
    private notisubject = new Subject<any>(); 
    ShowProgress(message: boolean) {
        this.subject.next(message);
    }
    getShowHideProgressStatus(): Observable<any> {
        return this.subject.asObservable();
    }    
    ShowNotification(message: string,type:string) {
        this.notisubject.next({message:message,type:type});
    }
    getShowNotification(): Observable<any> {
        return this.notisubject.asObservable();
    } 
}