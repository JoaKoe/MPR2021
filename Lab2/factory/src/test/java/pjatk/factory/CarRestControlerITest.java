package pjatk.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CarRestControlerITest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldPrintHelloWorld() throws Exception{
        mockMvc.perform(get("/cars/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((content().string(("Hello world"))));

    }

    @Test
    void shouldBuild() throws Exception{
        mockMvc.perform(get("/cars/build"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((content().string("{\"id\":1,\"wheels\":\"black\",\"color\":\"red\",\"engine\":\"sport\",\"model\":\"Passat\",\"marka\":\"Volkswagen\",\"numberOfWheels\":3,\"wrack\":false}")));

    }

    @Test
    void shouldFind() throws Exception{
        mockMvc.perform(get("/cars/find"))
                .andDo(print())
                .andExpect(status().isOk());

    }
}
