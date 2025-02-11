package RetoAgendarCitas.models.setdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class DataCita {
    String comentario;
    String lista;


    public static List<DataCita> setData(DataTable dataTable) {
        List<DataCita> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, DataCita.class));
        }
        return dates;

    }
}
