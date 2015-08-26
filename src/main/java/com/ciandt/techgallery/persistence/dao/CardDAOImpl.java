package com.ciandt.techgallery.persistence.dao;

import java.util.List;

import com.ciandt.techgallery.ofy.OfyService;
import com.ciandt.techgallery.persistence.model.Card;
import com.googlecode.objectify.Objectify;

/**
 * Card DAO Implementation class.
 * 
 * @author Felipe Goncalves de Castro
 *
 */
public class CardDAOImpl implements CardDAO {

  @Override
  public List<Card> findAll() {
    Objectify objectify = OfyService.ofy();
    // field 'name' is indexed.
    List<Card> cards = objectify.load().type(Card.class).order("-name").list();
    // objectify.load().type(UserGroup.class).order("-name").list();
    return cards;
  }

  @Override
  public Card findById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean addCard(Card card) {
    Objectify objectify = OfyService.ofy();
    objectify.save().entity(card).now();

    if (card.getId() != null) {
      return true;
    } else {
      return false;
    }
  }

}
