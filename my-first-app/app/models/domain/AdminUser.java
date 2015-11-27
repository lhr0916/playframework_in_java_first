package models.domain;


import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.db.jpa.*;

/**
 * Created by catherine on 2015. 11. 25..
 */

@Entity
public class AdminUser extends Model{
   @Id
   public String id;

   @Formats.DateTime(pattern = "yyyy-mm-dd HH:MM:DD")
   public Date lastVisit = new java.sql.Date(Calendar.getInstance().getTime().getTime());
   public String role="N";

}
