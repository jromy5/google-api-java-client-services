/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.mybusinesslodging.v1.model;

/**
 * Amenities and features related to leisure and play.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Lodging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Activities extends com.google.api.client.json.GenericJson {

  /**
   * Beach access. The hotel property is in close proximity to a beach and offers a way to get to
   * that beach. This can include a route to the beach such as stairs down if hotel is on a bluff,
   * or a short trail. Not the same as beachfront (with beach access, the hotel's proximity is close
   * to but not right on the beach).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean beachAccess;

  /**
   * Beach access exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String beachAccessException;

  /**
   * Breach front. The hotel property is physically located on the beach alongside an ocean, sea,
   * gulf, or bay. It is not on a lake, river, stream, or pond. The hotel is not separated from the
   * beach by a public road allowing vehicular, pedestrian, or bicycle traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean beachFront;

  /**
   * Beach front exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String beachFrontException;

  /**
   * Bicycle rental. The hotel owns bicycles that it permits guests to borrow and use. Can be free
   * or for a fee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bicycleRental;

  /**
   * Bicycle rental exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bicycleRentalException;

  /**
   * Boutique stores. There are stores selling clothing, jewelry, art and decor either on hotel
   * premises or very close by. Does not refer to the hotel gift shop or convenience store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boutiqueStores;

  /**
   * Boutique stores exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String boutiqueStoresException;

  /**
   * Casino. A space designated for gambling and gaming featuring croupier-run table and card games,
   * as well as electronic slot machines. May be on hotel premises or located nearby.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean casino;

  /**
   * Casino exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String casinoException;

  /**
   * Free bicycle rental. The hotel owns bicycles that it permits guests to borrow and use for free.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean freeBicycleRental;

  /**
   * Free bicycle rental exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String freeBicycleRentalException;

  /**
   * Free watercraft rental. The hotel owns watercraft that it permits guests to borrow and use for
   * free.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean freeWatercraftRental;

  /**
   * Free Watercraft rental exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String freeWatercraftRentalException;

  /**
   * Game room. There is a room at the hotel containing electronic machines for play such as
   * pinball, prize machines, driving simulators, and other items commonly found at a family fun
   * center or arcade. May also include non-electronic games like pool, foosball, darts, and more.
   * May or may not be designed for children. Also known as arcade, fun room, or family fun center.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean gameRoom;

  /**
   * Game room exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gameRoomException;

  /**
   * Golf. There is a golf course on hotel grounds or there is a nearby, independently run golf
   * course that allows use by hotel guests. Can be free or for a fee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean golf;

  /**
   * Golf exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String golfException;

  /**
   * Horseback riding. The hotel has a horse barn onsite or an affiliation with a nearby barn to
   * allow for guests to sit astride a horse and direct it to walk, trot, cantor, gallop and/or
   * jump. Can be in a riding ring, on designated paths, or in the wilderness. May or may not
   * involve instruction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean horsebackRiding;

  /**
   * Horseback riding exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String horsebackRidingException;

  /**
   * Nightclub. There is a room at the hotel with a bar, a dance floor, and seating where designated
   * staffers play dance music. There may also be a designated area for the performance of live
   * music, singing and comedy acts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean nightclub;

  /**
   * Nightclub exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nightclubException;

  /**
   * Private beach. The beach which is in close proximity to the hotel is open only to guests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean privateBeach;

  /**
   * Private beach exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateBeachException;

  /**
   * Scuba. The provision for guests to dive under naturally occurring water fitted with a self-
   * contained underwater breathing apparatus (SCUBA) for the purpose of exploring underwater life.
   * Apparatus consists of a tank providing oxygen to the diver through a mask. Requires
   * certification of the diver and supervision. The hotel may have the activity at its own
   * waterfront or have an affiliation with a nearby facility. Required equipment is most often
   * supplied to guests. Can be free or for a fee. Not snorkeling. Not done in a swimming pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean scuba;

  /**
   * Scuba exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scubaException;

  /**
   * Snorkeling. The provision for guests to participate in a recreational water activity in which
   * swimmers wear a diving mask, a simple, shaped breathing tube and flippers/swim fins for the
   * purpose of exploring below the surface of an ocean, gulf or lake. Does not usually require user
   * certification or professional supervision. Equipment may or may not be available for rent or
   * purchase. Not scuba diving.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean snorkeling;

  /**
   * Snorkeling exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snorkelingException;

  /**
   * Tennis. The hotel has the requisite court(s) on site or has an affiliation with a nearby
   * facility for the purpose of providing guests with the opportunity to play a two-sided court-
   * based game in which players use a stringed racquet to hit a ball across a net to the side of
   * the opposing player. The court can be indoors or outdoors. Instructors, racquets and balls may
   * or may not be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean tennis;

  /**
   * Tennis exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tennisException;

  /**
   * Water skiing. The provision of giving guests the opportunity to be pulled across naturally
   * occurring water while standing on skis and holding a tow rope attached to a motorboat. Can
   * occur on hotel premises or at a nearby waterfront. Most often performed in a lake or ocean.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean waterSkiing;

  /**
   * Water skiing exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String waterSkiingException;

  /**
   * Watercraft rental. The hotel owns water vessels that it permits guests to borrow and use. Can
   * be free or for a fee. Watercraft may include boats, pedal boats, rowboats, sailboats,
   * powerboats, canoes, kayaks, or personal watercraft (such as a Jet Ski).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean watercraftRental;

  /**
   * Watercraft rental exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String watercraftRentalException;

  /**
   * Beach access. The hotel property is in close proximity to a beach and offers a way to get to
   * that beach. This can include a route to the beach such as stairs down if hotel is on a bluff,
   * or a short trail. Not the same as beachfront (with beach access, the hotel's proximity is close
   * to but not right on the beach).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBeachAccess() {
    return beachAccess;
  }

  /**
   * Beach access. The hotel property is in close proximity to a beach and offers a way to get to
   * that beach. This can include a route to the beach such as stairs down if hotel is on a bluff,
   * or a short trail. Not the same as beachfront (with beach access, the hotel's proximity is close
   * to but not right on the beach).
   * @param beachAccess beachAccess or {@code null} for none
   */
  public Activities setBeachAccess(java.lang.Boolean beachAccess) {
    this.beachAccess = beachAccess;
    return this;
  }

  /**
   * Beach access exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBeachAccessException() {
    return beachAccessException;
  }

  /**
   * Beach access exception.
   * @param beachAccessException beachAccessException or {@code null} for none
   */
  public Activities setBeachAccessException(java.lang.String beachAccessException) {
    this.beachAccessException = beachAccessException;
    return this;
  }

  /**
   * Breach front. The hotel property is physically located on the beach alongside an ocean, sea,
   * gulf, or bay. It is not on a lake, river, stream, or pond. The hotel is not separated from the
   * beach by a public road allowing vehicular, pedestrian, or bicycle traffic.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBeachFront() {
    return beachFront;
  }

  /**
   * Breach front. The hotel property is physically located on the beach alongside an ocean, sea,
   * gulf, or bay. It is not on a lake, river, stream, or pond. The hotel is not separated from the
   * beach by a public road allowing vehicular, pedestrian, or bicycle traffic.
   * @param beachFront beachFront or {@code null} for none
   */
  public Activities setBeachFront(java.lang.Boolean beachFront) {
    this.beachFront = beachFront;
    return this;
  }

  /**
   * Beach front exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBeachFrontException() {
    return beachFrontException;
  }

  /**
   * Beach front exception.
   * @param beachFrontException beachFrontException or {@code null} for none
   */
  public Activities setBeachFrontException(java.lang.String beachFrontException) {
    this.beachFrontException = beachFrontException;
    return this;
  }

  /**
   * Bicycle rental. The hotel owns bicycles that it permits guests to borrow and use. Can be free
   * or for a fee.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBicycleRental() {
    return bicycleRental;
  }

  /**
   * Bicycle rental. The hotel owns bicycles that it permits guests to borrow and use. Can be free
   * or for a fee.
   * @param bicycleRental bicycleRental or {@code null} for none
   */
  public Activities setBicycleRental(java.lang.Boolean bicycleRental) {
    this.bicycleRental = bicycleRental;
    return this;
  }

  /**
   * Bicycle rental exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBicycleRentalException() {
    return bicycleRentalException;
  }

  /**
   * Bicycle rental exception.
   * @param bicycleRentalException bicycleRentalException or {@code null} for none
   */
  public Activities setBicycleRentalException(java.lang.String bicycleRentalException) {
    this.bicycleRentalException = bicycleRentalException;
    return this;
  }

  /**
   * Boutique stores. There are stores selling clothing, jewelry, art and decor either on hotel
   * premises or very close by. Does not refer to the hotel gift shop or convenience store.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoutiqueStores() {
    return boutiqueStores;
  }

  /**
   * Boutique stores. There are stores selling clothing, jewelry, art and decor either on hotel
   * premises or very close by. Does not refer to the hotel gift shop or convenience store.
   * @param boutiqueStores boutiqueStores or {@code null} for none
   */
  public Activities setBoutiqueStores(java.lang.Boolean boutiqueStores) {
    this.boutiqueStores = boutiqueStores;
    return this;
  }

  /**
   * Boutique stores exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBoutiqueStoresException() {
    return boutiqueStoresException;
  }

  /**
   * Boutique stores exception.
   * @param boutiqueStoresException boutiqueStoresException or {@code null} for none
   */
  public Activities setBoutiqueStoresException(java.lang.String boutiqueStoresException) {
    this.boutiqueStoresException = boutiqueStoresException;
    return this;
  }

  /**
   * Casino. A space designated for gambling and gaming featuring croupier-run table and card games,
   * as well as electronic slot machines. May be on hotel premises or located nearby.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCasino() {
    return casino;
  }

  /**
   * Casino. A space designated for gambling and gaming featuring croupier-run table and card games,
   * as well as electronic slot machines. May be on hotel premises or located nearby.
   * @param casino casino or {@code null} for none
   */
  public Activities setCasino(java.lang.Boolean casino) {
    this.casino = casino;
    return this;
  }

  /**
   * Casino exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getCasinoException() {
    return casinoException;
  }

  /**
   * Casino exception.
   * @param casinoException casinoException or {@code null} for none
   */
  public Activities setCasinoException(java.lang.String casinoException) {
    this.casinoException = casinoException;
    return this;
  }

  /**
   * Free bicycle rental. The hotel owns bicycles that it permits guests to borrow and use for free.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFreeBicycleRental() {
    return freeBicycleRental;
  }

  /**
   * Free bicycle rental. The hotel owns bicycles that it permits guests to borrow and use for free.
   * @param freeBicycleRental freeBicycleRental or {@code null} for none
   */
  public Activities setFreeBicycleRental(java.lang.Boolean freeBicycleRental) {
    this.freeBicycleRental = freeBicycleRental;
    return this;
  }

  /**
   * Free bicycle rental exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getFreeBicycleRentalException() {
    return freeBicycleRentalException;
  }

  /**
   * Free bicycle rental exception.
   * @param freeBicycleRentalException freeBicycleRentalException or {@code null} for none
   */
  public Activities setFreeBicycleRentalException(java.lang.String freeBicycleRentalException) {
    this.freeBicycleRentalException = freeBicycleRentalException;
    return this;
  }

  /**
   * Free watercraft rental. The hotel owns watercraft that it permits guests to borrow and use for
   * free.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFreeWatercraftRental() {
    return freeWatercraftRental;
  }

  /**
   * Free watercraft rental. The hotel owns watercraft that it permits guests to borrow and use for
   * free.
   * @param freeWatercraftRental freeWatercraftRental or {@code null} for none
   */
  public Activities setFreeWatercraftRental(java.lang.Boolean freeWatercraftRental) {
    this.freeWatercraftRental = freeWatercraftRental;
    return this;
  }

  /**
   * Free Watercraft rental exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getFreeWatercraftRentalException() {
    return freeWatercraftRentalException;
  }

  /**
   * Free Watercraft rental exception.
   * @param freeWatercraftRentalException freeWatercraftRentalException or {@code null} for none
   */
  public Activities setFreeWatercraftRentalException(java.lang.String freeWatercraftRentalException) {
    this.freeWatercraftRentalException = freeWatercraftRentalException;
    return this;
  }

  /**
   * Game room. There is a room at the hotel containing electronic machines for play such as
   * pinball, prize machines, driving simulators, and other items commonly found at a family fun
   * center or arcade. May also include non-electronic games like pool, foosball, darts, and more.
   * May or may not be designed for children. Also known as arcade, fun room, or family fun center.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGameRoom() {
    return gameRoom;
  }

  /**
   * Game room. There is a room at the hotel containing electronic machines for play such as
   * pinball, prize machines, driving simulators, and other items commonly found at a family fun
   * center or arcade. May also include non-electronic games like pool, foosball, darts, and more.
   * May or may not be designed for children. Also known as arcade, fun room, or family fun center.
   * @param gameRoom gameRoom or {@code null} for none
   */
  public Activities setGameRoom(java.lang.Boolean gameRoom) {
    this.gameRoom = gameRoom;
    return this;
  }

  /**
   * Game room exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getGameRoomException() {
    return gameRoomException;
  }

  /**
   * Game room exception.
   * @param gameRoomException gameRoomException or {@code null} for none
   */
  public Activities setGameRoomException(java.lang.String gameRoomException) {
    this.gameRoomException = gameRoomException;
    return this;
  }

  /**
   * Golf. There is a golf course on hotel grounds or there is a nearby, independently run golf
   * course that allows use by hotel guests. Can be free or for a fee.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGolf() {
    return golf;
  }

  /**
   * Golf. There is a golf course on hotel grounds or there is a nearby, independently run golf
   * course that allows use by hotel guests. Can be free or for a fee.
   * @param golf golf or {@code null} for none
   */
  public Activities setGolf(java.lang.Boolean golf) {
    this.golf = golf;
    return this;
  }

  /**
   * Golf exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getGolfException() {
    return golfException;
  }

  /**
   * Golf exception.
   * @param golfException golfException or {@code null} for none
   */
  public Activities setGolfException(java.lang.String golfException) {
    this.golfException = golfException;
    return this;
  }

  /**
   * Horseback riding. The hotel has a horse barn onsite or an affiliation with a nearby barn to
   * allow for guests to sit astride a horse and direct it to walk, trot, cantor, gallop and/or
   * jump. Can be in a riding ring, on designated paths, or in the wilderness. May or may not
   * involve instruction.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHorsebackRiding() {
    return horsebackRiding;
  }

  /**
   * Horseback riding. The hotel has a horse barn onsite or an affiliation with a nearby barn to
   * allow for guests to sit astride a horse and direct it to walk, trot, cantor, gallop and/or
   * jump. Can be in a riding ring, on designated paths, or in the wilderness. May or may not
   * involve instruction.
   * @param horsebackRiding horsebackRiding or {@code null} for none
   */
  public Activities setHorsebackRiding(java.lang.Boolean horsebackRiding) {
    this.horsebackRiding = horsebackRiding;
    return this;
  }

  /**
   * Horseback riding exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getHorsebackRidingException() {
    return horsebackRidingException;
  }

  /**
   * Horseback riding exception.
   * @param horsebackRidingException horsebackRidingException or {@code null} for none
   */
  public Activities setHorsebackRidingException(java.lang.String horsebackRidingException) {
    this.horsebackRidingException = horsebackRidingException;
    return this;
  }

  /**
   * Nightclub. There is a room at the hotel with a bar, a dance floor, and seating where designated
   * staffers play dance music. There may also be a designated area for the performance of live
   * music, singing and comedy acts.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNightclub() {
    return nightclub;
  }

  /**
   * Nightclub. There is a room at the hotel with a bar, a dance floor, and seating where designated
   * staffers play dance music. There may also be a designated area for the performance of live
   * music, singing and comedy acts.
   * @param nightclub nightclub or {@code null} for none
   */
  public Activities setNightclub(java.lang.Boolean nightclub) {
    this.nightclub = nightclub;
    return this;
  }

  /**
   * Nightclub exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getNightclubException() {
    return nightclubException;
  }

  /**
   * Nightclub exception.
   * @param nightclubException nightclubException or {@code null} for none
   */
  public Activities setNightclubException(java.lang.String nightclubException) {
    this.nightclubException = nightclubException;
    return this;
  }

  /**
   * Private beach. The beach which is in close proximity to the hotel is open only to guests.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrivateBeach() {
    return privateBeach;
  }

  /**
   * Private beach. The beach which is in close proximity to the hotel is open only to guests.
   * @param privateBeach privateBeach or {@code null} for none
   */
  public Activities setPrivateBeach(java.lang.Boolean privateBeach) {
    this.privateBeach = privateBeach;
    return this;
  }

  /**
   * Private beach exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateBeachException() {
    return privateBeachException;
  }

  /**
   * Private beach exception.
   * @param privateBeachException privateBeachException or {@code null} for none
   */
  public Activities setPrivateBeachException(java.lang.String privateBeachException) {
    this.privateBeachException = privateBeachException;
    return this;
  }

  /**
   * Scuba. The provision for guests to dive under naturally occurring water fitted with a self-
   * contained underwater breathing apparatus (SCUBA) for the purpose of exploring underwater life.
   * Apparatus consists of a tank providing oxygen to the diver through a mask. Requires
   * certification of the diver and supervision. The hotel may have the activity at its own
   * waterfront or have an affiliation with a nearby facility. Required equipment is most often
   * supplied to guests. Can be free or for a fee. Not snorkeling. Not done in a swimming pool.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getScuba() {
    return scuba;
  }

  /**
   * Scuba. The provision for guests to dive under naturally occurring water fitted with a self-
   * contained underwater breathing apparatus (SCUBA) for the purpose of exploring underwater life.
   * Apparatus consists of a tank providing oxygen to the diver through a mask. Requires
   * certification of the diver and supervision. The hotel may have the activity at its own
   * waterfront or have an affiliation with a nearby facility. Required equipment is most often
   * supplied to guests. Can be free or for a fee. Not snorkeling. Not done in a swimming pool.
   * @param scuba scuba or {@code null} for none
   */
  public Activities setScuba(java.lang.Boolean scuba) {
    this.scuba = scuba;
    return this;
  }

  /**
   * Scuba exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getScubaException() {
    return scubaException;
  }

  /**
   * Scuba exception.
   * @param scubaException scubaException or {@code null} for none
   */
  public Activities setScubaException(java.lang.String scubaException) {
    this.scubaException = scubaException;
    return this;
  }

  /**
   * Snorkeling. The provision for guests to participate in a recreational water activity in which
   * swimmers wear a diving mask, a simple, shaped breathing tube and flippers/swim fins for the
   * purpose of exploring below the surface of an ocean, gulf or lake. Does not usually require user
   * certification or professional supervision. Equipment may or may not be available for rent or
   * purchase. Not scuba diving.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSnorkeling() {
    return snorkeling;
  }

  /**
   * Snorkeling. The provision for guests to participate in a recreational water activity in which
   * swimmers wear a diving mask, a simple, shaped breathing tube and flippers/swim fins for the
   * purpose of exploring below the surface of an ocean, gulf or lake. Does not usually require user
   * certification or professional supervision. Equipment may or may not be available for rent or
   * purchase. Not scuba diving.
   * @param snorkeling snorkeling or {@code null} for none
   */
  public Activities setSnorkeling(java.lang.Boolean snorkeling) {
    this.snorkeling = snorkeling;
    return this;
  }

  /**
   * Snorkeling exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getSnorkelingException() {
    return snorkelingException;
  }

  /**
   * Snorkeling exception.
   * @param snorkelingException snorkelingException or {@code null} for none
   */
  public Activities setSnorkelingException(java.lang.String snorkelingException) {
    this.snorkelingException = snorkelingException;
    return this;
  }

  /**
   * Tennis. The hotel has the requisite court(s) on site or has an affiliation with a nearby
   * facility for the purpose of providing guests with the opportunity to play a two-sided court-
   * based game in which players use a stringed racquet to hit a ball across a net to the side of
   * the opposing player. The court can be indoors or outdoors. Instructors, racquets and balls may
   * or may not be provided.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTennis() {
    return tennis;
  }

  /**
   * Tennis. The hotel has the requisite court(s) on site or has an affiliation with a nearby
   * facility for the purpose of providing guests with the opportunity to play a two-sided court-
   * based game in which players use a stringed racquet to hit a ball across a net to the side of
   * the opposing player. The court can be indoors or outdoors. Instructors, racquets and balls may
   * or may not be provided.
   * @param tennis tennis or {@code null} for none
   */
  public Activities setTennis(java.lang.Boolean tennis) {
    this.tennis = tennis;
    return this;
  }

  /**
   * Tennis exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getTennisException() {
    return tennisException;
  }

  /**
   * Tennis exception.
   * @param tennisException tennisException or {@code null} for none
   */
  public Activities setTennisException(java.lang.String tennisException) {
    this.tennisException = tennisException;
    return this;
  }

  /**
   * Water skiing. The provision of giving guests the opportunity to be pulled across naturally
   * occurring water while standing on skis and holding a tow rope attached to a motorboat. Can
   * occur on hotel premises or at a nearby waterfront. Most often performed in a lake or ocean.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWaterSkiing() {
    return waterSkiing;
  }

  /**
   * Water skiing. The provision of giving guests the opportunity to be pulled across naturally
   * occurring water while standing on skis and holding a tow rope attached to a motorboat. Can
   * occur on hotel premises or at a nearby waterfront. Most often performed in a lake or ocean.
   * @param waterSkiing waterSkiing or {@code null} for none
   */
  public Activities setWaterSkiing(java.lang.Boolean waterSkiing) {
    this.waterSkiing = waterSkiing;
    return this;
  }

  /**
   * Water skiing exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getWaterSkiingException() {
    return waterSkiingException;
  }

  /**
   * Water skiing exception.
   * @param waterSkiingException waterSkiingException or {@code null} for none
   */
  public Activities setWaterSkiingException(java.lang.String waterSkiingException) {
    this.waterSkiingException = waterSkiingException;
    return this;
  }

  /**
   * Watercraft rental. The hotel owns water vessels that it permits guests to borrow and use. Can
   * be free or for a fee. Watercraft may include boats, pedal boats, rowboats, sailboats,
   * powerboats, canoes, kayaks, or personal watercraft (such as a Jet Ski).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWatercraftRental() {
    return watercraftRental;
  }

  /**
   * Watercraft rental. The hotel owns water vessels that it permits guests to borrow and use. Can
   * be free or for a fee. Watercraft may include boats, pedal boats, rowboats, sailboats,
   * powerboats, canoes, kayaks, or personal watercraft (such as a Jet Ski).
   * @param watercraftRental watercraftRental or {@code null} for none
   */
  public Activities setWatercraftRental(java.lang.Boolean watercraftRental) {
    this.watercraftRental = watercraftRental;
    return this;
  }

  /**
   * Watercraft rental exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getWatercraftRentalException() {
    return watercraftRentalException;
  }

  /**
   * Watercraft rental exception.
   * @param watercraftRentalException watercraftRentalException or {@code null} for none
   */
  public Activities setWatercraftRentalException(java.lang.String watercraftRentalException) {
    this.watercraftRentalException = watercraftRentalException;
    return this;
  }

  @Override
  public Activities set(String fieldName, Object value) {
    return (Activities) super.set(fieldName, value);
  }

  @Override
  public Activities clone() {
    return (Activities) super.clone();
  }

}