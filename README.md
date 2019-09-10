# flp

## Changes

### bean/Wishlist.java

Changed Data type to Integer from Long of: 
- prod_Quantity ( variable )
- getProd_Quantity ( function )

### controller/ProductController.java

- Updated POST Method of wishlist/{prod_Id}

### repository/WishListRepository.java

Added new functions: 

- checkProduct(Long prod_id)
- getQuantity(Long prod_id)
- updateProduct(Integer quantity, Long prod_Id)

**Note the Annontations of the functions as update command must have Modifying Annontation**

### service/IProductService.java

Added new functions:

- public Boolean isNewProduct(Long prodId);
- public WishList updateWishList(Long prodId);

### service/ProductServiceImpl.java

Added Implementation of functions:

- public Boolean isNewProduct(Long prodId);
- public WishList updateWishList(Long prodId);
- Changed arguments in addToWishList() of setProd_Quantity() to 1 because every time only 1 quantity.

**IMP NOTE :** Don't use my application.properties it may lead to some uncertain problems
