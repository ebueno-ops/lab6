package ca.sait.lab6.services;


import ca.sait.lab6.dataacess.UserDB;
import ca.sait.lab6.models.Role;
import ca.sait.lab6.models.User;
import java.util.List;


public class UserService {
    private UserDB userDB = new UserDB();

    public User get(String email) throws Exception {
        User user = this.userDB.get(email);
        return user;
    }
    
    public List<User> getAll() throws Exception {
        List<User> users = this.userDB.getAll();
        return users;
    }
    
    public void insert(String email, boolean active, String firstName, String lastName, String password, Role role) throws Exception {
        User user = new User(email, active, firstName, lastName, password, role);
        this.userDB.insert(user);
    }
    
    public void update(String email, boolean active, String firstName, String lastName, String password, Role role) throws Exception {
        User user = new User(email, active, firstName, lastName, password, role);
        this.userDB.update(user);
    }
    
    public void delete(String email) throws Exception {
        Note note = new Note();
        note.setNoteId(noteId);
        noteDB.delete(note);
    }
}
