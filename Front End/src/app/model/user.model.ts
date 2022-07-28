export class user{
    id?: number;
    name: String;
    lastName: String;
    profilePic: String;

    constructor(name:String, lastName:String, profilePic: String){
        this.name = name;
        this.lastName = lastName;
        this.profilePic = profilePic;
    }
}