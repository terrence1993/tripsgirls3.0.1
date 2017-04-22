package trips.girls.service;


public interface UserSecurityService  {

    String validatePasswordResetToken(long id, String token);

}