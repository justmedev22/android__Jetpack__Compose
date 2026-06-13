package pe.edu.idat.appmvvmapirest.posts.domain

import pe.edu.idat.appmvvmapirest.posts.data.network.response.PostResponse
import pe.edu.idat.appmvvmapirest.posts.data.repository.PostRepository
import javax.inject.Inject

class GetPostUseCase @Inject constructor(private val postRepository: PostRepository
) {

    suspend operator fun invoke(): List<PostResponse> {
        return postRepository.getPost()
    }
}