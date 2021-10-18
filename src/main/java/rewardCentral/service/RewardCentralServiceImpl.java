package rewardCentral.service;

import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Service
public class RewardCentralServiceImpl implements RewardCentralService{

    private final RewardCentral rewardCentral;

    public RewardCentralServiceImpl(RewardCentral rewardCentral) {
        this.rewardCentral = rewardCentral;
    }

    @Override
    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
        return rewardCentral.getAttractionRewardPoints(attractionId, userId);
    }
}
