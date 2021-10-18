package rewardCentral.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import rewardCentral.service.RewardCentralService;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class RewardCentralControllerTests {

    @MockBean
    private RewardCentralService rewardCentralService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAttractionRewardPointsShouldReturn200AndRewardPointAsInteger() throws Exception {
        String attractionId = "00000000-0000-0000-0000-000000000001";
        String userId = "00000000-0000-0000-0000-000000000002";
        Mockito.when(rewardCentralService.getAttractionRewardPoints(UUID.fromString(attractionId), UUID.fromString(userId))).thenReturn(1);

        mockMvc.perform(get("/getRewardPoints")
        .param("attractionId", attractionId)
        .param("userId", userId))
                .andExpect(mvcResult -> {
                    Assert.assertEquals(HttpStatus.OK.value(), mvcResult.getResponse().getStatus());
                    Assert.assertEquals(String.valueOf(1),mvcResult.getResponse().getContentAsString());
                });
    }
}
