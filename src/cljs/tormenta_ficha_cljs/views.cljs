(ns tormenta-ficha-cljs.views
  (:require
   [re-frame.core :as rf]
   [tormenta-ficha-cljs.subs :as subs]
   [tormenta-ficha-cljs.events :as events]
   ))

(defn character-name []
  [:label "Nome do Personagem"
    [:input {:type "text"
             :value @(rf/subscribe [::subs/character-name])
             :placeholder "Fulano"
             :on-change #(rf/dispatch [::events/character-name-change (-> % .-target .-value)])}]])

(defn header []
  [:div
   (character-name)])

(defn main-panel []
  [:div
   [:h1 "Tormenta 20 - Ficha"]
   [header]])
