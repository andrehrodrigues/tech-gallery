package com.ciandt.techgallery.persistence.dao;

import java.util.List;

import com.ciandt.techgallery.persistence.model.Card;

/**
 * Card DAO methods.
 * 
 * @author Felipe Goncalves de Castro
 *
 */
public interface CardDAO {

  /**
   * Method that return a list with all User Group.
   * 
   * @return list of user group.
   */
  public List<Card> findAll();

  /**
   * Method that return a Card by its Id.
   * 
   * @param card id.
   * @return card entity.
   */
  public Card findById(final Long id);

  /**
   * Method that adds a new Card entity.
   * 
   * @param card entity.
   * @return success or failure.
   */
  public boolean addCard(final Card card);

}
