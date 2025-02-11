package RetoAgendarCitas.models.setdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class LoginCitas {
    String usuario;
    String contrasena;


    public static List<LoginCitas> setData(DataTable dataTable){
        List<LoginCitas> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo){
            dates.add(new ObjectMapper().convertValue(map, LoginCitas.class));
        }
        return dates;

    }
}
