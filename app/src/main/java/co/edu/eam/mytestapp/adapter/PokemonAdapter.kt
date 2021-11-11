package co.edu.eam.mytestapp.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.edu.eam.mytestapp.databinding.ItemPokemonBinding
import co.edu.eam.mytestapp.model.pokemon.Pokemon
import com.bumptech.glide.Glide

class PokemonAdapter(var lista:Array<Pokemon?>):RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    val fireElement="#d2192f"
    val electricElement="#ccd219"
    val waterElement="#19d2d2"
    val grassElement="#19d244"
    val iceElement="#00ffbf"
    val fightingElement="#ff6600"
    val rockElement="#732800"
    val psychicElement="#db00af"
    val flyingElement="#7578fa"
    val bugElement="#007502"
    val poisonElement="#2b0057"
    val steelElement="#005730"
    val normalElement="#ff8cea"
    val groundElement="#c25400"
    val ghostElement="#3e17ff"
    val fairyElement="#ff0040"
    val dragonElement="#00ffcc"
    val darkElement="#424242"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ItemPokemonBinding.inflate( LayoutInflater.from(parent.context), parent, false )
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPokemon(lista.get(position))
    }

    override fun getItemCount(): Int = lista.size

    inner class ViewHolder(var view:ItemPokemonBinding):RecyclerView.ViewHolder(view.root){

        fun bindPokemon(pokemon: Pokemon?){
            if(pokemon!=null) {
                Glide.with(view.imgPoke.context)
                    .load(pokemon.image)
                    .into(view.imgPoke)
                view.numPoke.text = pokemon.id.toString()
                view.namePoke.text = pokemon.name
                pokemon.types.forEach {
                    if (it.type.name == "grass") {
                        view.parentLayout.setBackgroundColor(Color.parseColor(grassElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/grass.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "fire"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(fireElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/fire.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "electric"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(electricElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/electric.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "water"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(waterElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/water.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "ice"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(iceElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/ice.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "fighting"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(fightingElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/fighting.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "rock"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(rockElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/rock.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "psychic"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(psychicElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/psychic.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "flying"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(flyingElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/flying.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "bug"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(bugElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/bug.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "poison"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(poisonElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/poison.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "dragon"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(dragonElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/dragon.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "steel"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(steelElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/steel.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "normal"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(normalElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/normal.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "ground"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(groundElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/ground.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "ghost"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(ghostElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/ghost.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "dark"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(darkElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/dark.png")
                            .into(view.imgIco)
                    }
                    if(it.type.name == "fairy"){
                        view.parentLayout.setBackgroundColor(Color.parseColor(fairyElement))
                        Glide.with(view.imgIco.context)
                            .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/fairy.png")
                            .into(view.imgIco)
                    }
                }
            }
        }
    }
}