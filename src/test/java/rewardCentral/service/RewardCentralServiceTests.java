package rewardCentral.service;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import rewardCentral.RewardCentral;

import java.util.UUID;

public class RewardCentralServiceTests {
    private final RewardCentral rewardCentralMock = Mockito.mock(RewardCentral.class);
    private final RewardCentralServiceImpl rewardCentralService = new RewardCentralServiceImpl(rewardCentralMock);

    @Test
    public void getAttractionRewardPointsTest(){
        Mockito.when(rewardCentralMock.getAttractionRewardPoints(UUID.fromString("00000000-0000-0000-0000-000000000001"), UUID.fromString("00000000-0000-0000-0000-000000000002"))).thenReturn(1);
        Assert.assertEquals(1, rewardCentralService.getAttractionRewardPoints(UUID.fromString("00000000-0000-0000-0000-000000000001"), UUID.fromString("00000000-0000-0000-0000-000000000002")));
    }
}
