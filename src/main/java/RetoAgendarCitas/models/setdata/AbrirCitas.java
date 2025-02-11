package RetoAgendarCitas.models.setdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AbrirCitas {
    String url;

    public String getUrl() {
        return url;
    }

    public static List<AbrirCitas> setData(DataTable dataTable) {
        List<AbrirCitas> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, AbrirCitas.class));
        }
        return dates;

    }
}
