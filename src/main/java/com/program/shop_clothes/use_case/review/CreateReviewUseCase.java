package com.program.shop_clothes.use_case.review;

import com.program.shop_clothes.domain.Review;
public interface CreateReviewUseCase {

    Review execute(String usernameUser, String idProduct, String content, int star);

}
