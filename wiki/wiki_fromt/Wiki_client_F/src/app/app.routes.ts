import { Routes } from '@angular/router';
import { InicioComponent } from './componets/inicio/inicio.component';
import { DashboarComponent } from './componets/dashboar/dashboar.component';
import { AddUserComponent } from './componets/add-user/add-user.component';
import { authGuard } from './guards/auth.guard';
import { ProjectComponent } from './componets/projects/project/project.component';
import { AddProjectComponent } from './componets/projects/add-project/add-project.component';
import { AddVersionComponent } from './componets/versions/add-version/add-version.component';
import { VersionComponent } from './componets/versions/version/version.component';

export const routes: Routes = [
    {path: 'wiki/hello', component: InicioComponent},
    {path:'addUser',component:AddUserComponent},
    {path: 'dashboar', component: DashboarComponent, canActivate:[authGuard]},
    {path:'project',component:ProjectComponent,canActivate:[authGuard]},
    {path:'add_project',component:AddProjectComponent,canActivate:[authGuard]},
    {path:'add_version',component:AddVersionComponent,canActivate:[authGuard]},
    {path:'version',component:VersionComponent,canActivate:[authGuard]},
    {path: '', component: InicioComponent } 
];
